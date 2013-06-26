package com.rookiecodes

import com.rookiecodes.Marker._


class Board {
  // array to store the board state
  var tiles = List.fill(9) { new Tile(Marker.EMPTY); }

  var winningMoves =
                List(
                      (0, 1, 2), (3, 4, 5), (6, 7, 8),
                      (0, 3, 6), (1, 4, 7), (2, 5, 8),
                      (0, 4, 8), (2, 4, 6)
                    )

  def hasWon(marker: Marker) {
    for(move <- winningMoves) {
      if (move._1 == marker &&
          move._2 == marker &&
          move._3 == marker) {
        return true
      }
    }
    return false
  }

  def move(position: Int, marker: Marker) {
    tiles(position).setMarker(marker)
  }

  def initialiseBoard() {
      for(tile <- tiles) {
          tile.setMarker(Marker.EMPTY)
      }
  }
}

