databaseChangeLog = {

    changeSet(author: "Randy Herron (generated)", id: "1464376284445-1") {
        createTable(tableName: "attribution") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "attributionPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "Randy Herron (generated)", id: "1464376284445-2") {
        addColumn(tableName: "quote") {
            column(name: "attribution_id", type: "bigint")
        }
    }

    changeSet(author: "Randy Herron (generated)", id: "1464376284445-3") {
        addForeignKeyConstraint(baseColumnNames: "attribution_id", baseTableName: "quote", constraintName: "FK_pwnr1jk3kqqqts3hgp4u8m6le", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "attribution")
    }
}
