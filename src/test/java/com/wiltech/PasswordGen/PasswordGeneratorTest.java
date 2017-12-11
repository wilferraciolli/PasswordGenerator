package com.wiltech.PasswordGen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * The type Password generator test.
 */
@RunWith(MockitoJUnitRunner.class)
public class PasswordGeneratorTest {

    /**
     * Test generate password as string.
     */
    @Test
    public void testGeneratePasswordAsString() {
        String passwordGenerated = PasswordGenerator.generatePasswordAsString();

        assertNotNull(passwordGenerated);
        assertEquals(20, passwordGenerated.length());
    }

}
