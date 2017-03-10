package net.rocboronat.baconfreedays

import com.nhaarman.mockito_kotlin.verify
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import java.util.*

class UpdateBaconDateShould {

    @Mock
    lateinit var baconRepository: BaconRepository

    @Mock
    lateinit var clock: Clock

    lateinit var updateBaconDate: UpdateBaconDate

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        updateBaconDate = UpdateBaconDate(clock, baconRepository)
    }

    @Test
    fun `store the actual hour on the repository`() {
        val now: Date = Date()
        `when`(clock.now()).thenReturn(now)

        updateBaconDate.updateLastBaconDate()

        verify(baconRepository).updateBaconDate(now)
    }
}

