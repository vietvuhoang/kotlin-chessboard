package vvu.study.kotlin.demo.games.chess.pieces

import vvu.study.kotlin.demo.games.chess.units.Board
import vvu.study.kotlin.demo.games.chess.units.PieceType
import vvu.study.kotlin.demo.games.chess.units.Position
import vvu.study.kotlin.demo.games.chess.units.Side

class Queen(
    site: Side,
    position: Position
) : Piece(PieceType.QUEEN, site, position) {
    override fun scan(board: Board): Set<Position> {
        TODO("Not yet implemented")
    }
}