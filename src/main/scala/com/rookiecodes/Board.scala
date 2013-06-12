package com.rookiecodes

import com.rookiecodes.Marker._

class Board {
  // array to store the board state
  var currentBoard = List(new Tile(Marker.EMPTY), new Tile(Marker.EMPTY), new Tile(Marker.EMPTY),
                   new Tile(Marker.EMPTY), new Tile(Marker.EMPTY), new Tile(Marker.EMPTY),
                   new Tile(Marker.EMPTY), new Tile(Marker.EMPTY), new Tile(Marker.EMPTY))

  var winningMoves = ((0, 1, 2), (3, 4, 5), (6, 7, 8),
                       (0, 3, 6), (1, 4, 7), (2, 5, 8),
                       (0, 4, 8), (2, 4, 6)
                     )

  // checkMove

  def hasWon(marker: Marker) {
     for (move <- 0 until winningMoves.length) {
       if (move._1 === marker &&
           move._2 === marker &&
           move._3 === marker) {
         return true
       }
     }
    return false
  }

  def move(position: Int, marker: Marker) {
    currentBoard.get(position).setMarker(marker)
  }

  def initialiseBoard() {
      currentBoard.foreach { tile =>
          tile.setMarker(Marker.EMPTY)
      }
  }
}

