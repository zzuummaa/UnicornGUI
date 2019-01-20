package com.example.demo.view

import com.example.demo.app.Styles
import com.example.demo.controller.DataService
import javafx.beans.property.DoubleProperty
import javafx.scene.paint.Color
import sun.rmi.runtime.Log
import tornadofx.*
import kotlin.reflect.jvm.reflect

class MainView : View("Unicorn Images") {
    val data: DataService by inject()
    val collsCount = 3
    val rowsCount  = 3
    val cellFitWidthProps  = ArrayList<DoubleProperty>()
    val cellFitHeightProps = ArrayList<DoubleProperty>()

    override val root = datagrid(data.kittens()) {
        singleSelect = false

        widthProperty().addListener { _,oldVal,newVal ->
            var newCellWidth = (newVal.toDouble() - 18.0 - horizontalCellSpacing * (collsCount + 1)) / collsCount
            if (newCellWidth < 0) newCellWidth = 0.0

            cellWidth = newCellWidth
            cellFitWidthProps.forEach { it.value = cellWidth }
        }

        heightProperty().addListener { _, _, newVal ->
            var newCellHeight = (newVal.toDouble() - 18.0 - verticalCellSpacing * (rowsCount + 1)) / rowsCount
            if (newCellHeight < 0) newCellHeight = 0.0

            cellHeight = newCellHeight
            cellFitHeightProps.forEach { it.value = cellHeight }
        }

        cellCache {
            imageview(it, true) {
                isPreserveRatio = true
                fitWidth = cellWidth
                fitHeight = cellHeight
                cellFitWidthProps.add(fitWidthProperty())
                cellFitHeightProps.add(fitHeightProperty())
            }
        }
    }
}