package dev.kata.stringcalculator


class TemplateEngine {
    fun execute(inputTemplate: String, variables: Map<String, String>): String {
        val template = Template(inputTemplate)

        for (variable in variables) {
            template.ReplaceVariable(Pair(variable.key, variable.value))
        }

        return "output"
    }

    fun main() {
        print("")
    }
}

data class ResponseTemplate (val result: String, val success: Boolean, val info : List<String>)




class Template(private val template: String) {

    init {

        val regex = Regex("""\$\{([\w-]+)\}""")
        val matches = regex.findAll(template)

        val keys = listOf<String>()



    }

    fun ReplaceVariable(pair: Pair<String, String>) {

        val replacer = "\${" + pair.first + "}"

        val output = template.replace(replacer, pair.second)
    }


}
