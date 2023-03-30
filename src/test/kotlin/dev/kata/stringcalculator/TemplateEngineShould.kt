package dev.kata.stringcalculator

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class TemplateEngineShould {

    @Test
    fun `there are no variables to replace`() {
        val variables = emptyMap<String, String>()
        val template = "This is a template with one"
        val engine = TemplateEngine()

        val output = engine.execute(template, variables)

        val expected = "This is a template with one"
        assertEquals(expected, output)
    }

    @Test
    fun `there are one variable to replace`() {
        val variables = mapOf("variable" to "foo")
        val template = "This is a template with one \${variable}"
        val engine = TemplateEngine()

        val output = engine.execute(template, variables)

        val expected = "This is a template with one foo"
        assertEquals(expected, output)
    }
//
//    @Test
//    fun `throw exception if variable is not present in the template`() {
//        val variables = emptyMap<String, String>()
//        val template = "This is a template with one \${variable}"
//        // replacer = ${x}
//        val engine = TemplateEngine()
//
//    }
}
