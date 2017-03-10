package net.rocboronat.baconfreedays

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import java.util.*

class LastBaconDateShould {

    @Mock
    lateinit var baconRepository: BaconRepository

    @Mock
    lateinit var clock: Clock

    lateinit var lastBaconDate: LastBaconDate

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        lastBaconDate = LastBaconDate(clock, baconRepository)
    }

    @Test
    fun `be now when just launched`() {
        val now: Date = Date()
        `when`(clock.now()).thenReturn(now)
        `when`(baconRepository.getLastBaconDate()).thenReturn(null)

        val lastBaconDate = lastBaconDate.getLastBaconDate()

        assertEquals(now, lastBaconDate)
    }

    @Test
    fun `be the repo value when it was launched before`() {
        val now: Date = Date()
        `when`(baconRepository.getLastBaconDate()).thenReturn(now)

        var lastBaconDate = lastBaconDate.getLastBaconDate()

        assertEquals(now, lastBaconDate)
    }
}

