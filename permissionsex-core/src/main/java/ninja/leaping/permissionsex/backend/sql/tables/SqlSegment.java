/**
 * PermissionsEx
 * Copyright (C) zml and PermissionsEx contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ninja.leaping.permissionsex.backend.sql.tables;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "segments")
public class SqlSegment {
    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(foreign = true)
    private SqlSubject subject;


    @DatabaseField(uniqueIndexName = "ident")
    private String type;
    @DatabaseField(uniqueIndexName = "ident")
    private String identifier;

    @ForeignCollectionField
    private ForeignCollection<SqlInheritance> parents;

    @ForeignCollectionField
    private ForeignCollection<SqlPermission> permissions;

    @ForeignCollectionField
    private ForeignCollection<SqlOption> options;
}
