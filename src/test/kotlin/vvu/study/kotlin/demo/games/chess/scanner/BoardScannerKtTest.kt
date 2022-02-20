package vvu.study.kotlin.demo.games.chess.scanner

import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import io.mockk.slot
import io.mockk.verify
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import vvu.study.kotlin.demo.games.chess.pieces.Piece
import vvu.study.kotlin.demo.games.chess.units.Board
import vvu.study.kotlin.demo.games.chess.units.Position

internal class BoardScannerKtTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun `Scan the Board by a List of Pieces THEN verify the Result`() {
        // Prepare the Board
        val board = Board()
        val firstMockPiece = mockk<Piece>()
        val firstMockResult = mockk<Set<Position>>()
        val secondMockPiece = mockk<Piece>()
        val secondMockResult = mockk<Set<Position>>()

        // Simulate the Behavior
        val firstPieceSlotBoard = slot<Board>()
        val secondPieceSlotBoard = slot<Board>()

        every { firstMockPiece.scan(capture(firstPieceSlotBoard)) } returns firstMockResult
        every { secondMockPiece.scan(capture(secondPieceSlotBoard)) } returns secondMockResult

        // Execute The Test

        val result = listOf(firstMockPiece, secondMockPiece).scan(board)

        // Verify the Test
        verify(exactly = 1) { firstMockPiece.scan(any()) }
        firstPieceSlotBoard.captured shouldBe board

        result[0].first shouldBe firstMockPiece
        result[0].second shouldBe firstMockResult

        verify(exactly = 1) { secondMockPiece.scan(any()) }
        secondPieceSlotBoard.captured shouldBe board
        result[1].first shouldBe secondMockPiece
        result[1].second shouldBe secondMockResult

    }

    @Test
    fun `Scan the Board by a List of Pieces BUT there is an Scanning Error EXPECT Error Piece will be Ignored`() {
        // Prepare the Board
        val board = Board()
        val firstMockPiece = mockk<Piece>()
        val firstMockResult = mockk<Set<Position>>()
        val secondMockPiece = mockk<Piece>()
        val thirdMockPiece = mockk<Piece>()
        val thirdMockResult = mockk<Set<Position>>()

        // Simulate the Behavior
        val firstPieceSlotBoard = slot<Board>()
        val secondPieceSlotBoard = slot<Board>()
        val thirdPieceSlotBoard = slot<Board>()

        every { firstMockPiece.scan(capture(firstPieceSlotBoard)) } returns firstMockResult
        every { secondMockPiece.scan(capture(secondPieceSlotBoard)) } throws Exception()
        every { thirdMockPiece.scan(capture(thirdPieceSlotBoard)) } returns thirdMockResult

        // Execute The Test

        val result = listOf(firstMockPiece, secondMockPiece, thirdMockPiece).scan(board)

        // Verify the Test
        verify(exactly = 1) { firstMockPiece.scan(any()) }
        firstPieceSlotBoard.captured shouldBe board

        verify(exactly = 1) { secondMockPiece.scan(any()) }
        secondPieceSlotBoard.captured shouldBe board

        verify(exactly = 1) { thirdMockPiece.scan(any()) }
        thirdPieceSlotBoard.captured shouldBe board


        result.size shouldBe 2

        result[0].first shouldBe firstMockPiece
        result[0].second shouldBe firstMockResult

        result[1].first shouldBe thirdMockPiece
        result[1].second shouldBe thirdMockResult
    }


}