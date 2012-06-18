package de.paluch.ccd;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import de.paluch.ccd.di.good.LoggingProvider;
import de.paluch.ccd.di.good.LowLevelClass;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import static org.mockito.Mockito.verify;

/**
 * Unit test for simple App.
 */
@RunWith(MockitoJUnitRunner.class)
public class UnitTestWithAMock {

    @Mock
    private LoggingProvider loggingProvider;

    @InjectMocks
    private final LowLevelClass lowLevelClass = new LowLevelClass();

    @org.junit.Test
    public void testDomething() throws Exception {

        lowLevelClass.execute();

        verify(loggingProvider).log("log statement");

        assertTrue(true);
        assertNotNull("i'm not null");

    }
}
