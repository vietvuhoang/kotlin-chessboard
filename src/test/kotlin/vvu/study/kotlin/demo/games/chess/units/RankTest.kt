package vvu.study.kotlin.demo.games.chess.units

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class RankTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun `character to Rank THEN verify`() {
        'A'.toRank() shouldBe Rank.A
        'a'.toRank() shouldBe Rank.A

        'B'.toRank() shouldBe Rank.B
        'b'.toRank() shouldBe Rank.B

        'C'.toRank() shouldBe Rank.C
        'c'.toRank() shouldBe Rank.C

        'D'.toRank() shouldBe Rank.D
        'd'.toRank() shouldBe Rank.D

        'E'.toRank() shouldBe Rank.E
        'e'.toRank() shouldBe Rank.E

        'F'.toRank() shouldBe Rank.F
        'f'.toRank() shouldBe Rank.F

        'G'.toRank() shouldBe Rank.G
        'g'.toRank() shouldBe Rank.G

        'H'.toRank() shouldBe Rank.H
        'h'.toRank() shouldBe Rank.H

        shouldThrow<IllegalRankError> { 'I'.toRank() }
    }

    @Test
    fun `Int to Rank THEN verify`() {
        1.toRank() shouldBe Rank.A
        2.toRank() shouldBe Rank.B
        3.toRank() shouldBe Rank.C
        4.toRank() shouldBe Rank.D
        5.toRank() shouldBe Rank.E
        6.toRank() shouldBe Rank.F
        7.toRank() shouldBe Rank.G
        8.toRank() shouldBe Rank.H
        shouldThrow<IllegalRankError> { (-1).toRank() }
    }

}