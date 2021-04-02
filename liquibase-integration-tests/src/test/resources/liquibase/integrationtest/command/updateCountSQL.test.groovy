package liquibase.integrationtest.command

CommandTest.define {
    command = ["updateCountSQL"]

    run {
        arguments = [
                count        : 1,
                changeLogFile: "changelogs/hsqldb/complete/simple.changelog.xml",
        ]

        expectedOutput ""

        expectedResults([
                statusMessage: "Successfully executed updateCountSQL",
                statusCode   : 0
        ])
    }
}
