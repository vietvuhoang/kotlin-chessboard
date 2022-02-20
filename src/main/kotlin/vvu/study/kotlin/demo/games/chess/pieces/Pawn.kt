package vvu.study.kotlin.demo.games.chess.pieces

import vvu.study.kotlin.demo.games.chess.units.Board
import vvu.study.kotlin.demo.games.chess.units.PieceType
import vvu.study.kotlin.demo.games.chess.units.Position
import vvu.study.kotlin.demo.games.chess.units.Side

class Pawn(
    site: Side,
    position: Position
) : Piece(PieceType.PAWN, site, position) {
    override fun scan(board: Board): Set<Position> {
        TODO("Not yet implemented")
    }
}
