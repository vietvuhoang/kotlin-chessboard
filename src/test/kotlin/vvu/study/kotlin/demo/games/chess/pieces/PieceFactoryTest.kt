package vvu.study.kotlin.demo.games.chess.pieces

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

import vvu.study.kotlin.demo.games.chess.units.PieceType
import vvu.study.kotlin.demo.games.chess.units.Side
import vvu.study.kotlin.demo.games.chess.units.toPosition

internal class PieceFactoryTest {

    @Test
    fun `create PAWN by Type THEN verify`() {
        val pawn = PieceFactory().create(PieceType.PAWN, Side.BLACK, "B4".toPosition())
        (pawn is Pawn) shouldBe true
        pawn.type shouldBe PieceType.PAWN
        pawn.site shouldBe Side.BLACK
        pawn.position.toString() shouldBe "B4"
    }

    @Test
    fun `create BISHOP by Type THEN verify`() {
        val bishop = PieceFactory().create(PieceType.BISHOP, Side.WHITE, "F1".toPosition())
        (bishop is Bishop) shouldBe true
        bishop.type shouldBe PieceType.BISHOP
        bishop.site shouldBe Side.WHITE
        bishop.position.toString() shouldBe "F1"
    }

    @Test
    fun `create KNIGHT by Type THEN verify`() {
        val knight = PieceFactory().create(PieceType.KNIGHT, Side.WHITE, "B6".toPosition())
        (knight is Knight) shouldBe true
        knight.type shouldBe PieceType.KNIGHT
        knight.site shouldBe Side.WHITE
        knight.position.toString() shouldBe "B6"
    }

    @Test
    fun `create ROOK by Type THEN verify`() {
        val rook = PieceFactory().create(PieceType.ROOK, Side.BLACK, "H8".toPosition())
        (rook is Rook) shouldBe true
        rook.type shouldBe PieceType.ROOK
        rook.site shouldBe Side.BLACK
        rook.position.toString() shouldBe "H8"
    }

    @Test
    fun `create QUEEN by Type THEN verify`() {
        val queen = PieceFactory().create(PieceType.QUEEN, Side.WHITE, "E1".toPosition())
        (queen is Queen) shouldBe true
        queen.type shouldBe PieceType.QUEEN
        queen.site shouldBe Side.WHITE
        queen.position.toString() shouldBe "E1"
    }

    @Test
    fun `create KING by Type THEN verify`() {
        val king = PieceFactory().create(PieceType.KING, Side.WHITE, "G1".toPosition())
        (king is King) shouldBe true
        king.type shouldBe PieceType.KING
        king.site shouldBe Side.WHITE
        king.position.toString() shouldBe "G1"
    }
}