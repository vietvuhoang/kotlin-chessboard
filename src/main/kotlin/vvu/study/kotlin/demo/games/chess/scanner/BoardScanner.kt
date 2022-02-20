package vvu.study.kotlin.demo.games.chess.scanner

import vvu.study.kotlin.demo.games.chess.pieces.Piece
import vvu.study.kotlin.demo.games.chess.units.Board
import vvu.study.kotlin.demo.games.chess.units.Position

typealias PieceScanningResult = Pair<Piece, Set<Position>>
typealias BoardScanResult = List<Pair<Piece, Set<Position>>>

fun List<Piece>.scan(board: Board): BoardScanResult =
    this.fold(initial = listOf()) {
        list, piece ->
        try {
            list + PieceScanningResult(piece, piece.scan(board = board))
        } catch ( e: Exception) {
            list
        }
    }