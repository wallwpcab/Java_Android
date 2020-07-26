package com.zulkarninecsedictionary;
import android.content.Context;
import android.database.sqlite.SQLiteDatabasel
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
public class DictionaryDatabaseHelper extends SQLiteOpenHelper {
    final static String DICTIONARY_DATABASE = "dictionary";
    final static String ITEM_ID_COLUMN = "id";
    final static String WORD_COLUMN = "word";
    final static String DEFINITION_COLUMN = "definition";
    final static String CREATE_DATABASE_QUERY = "CREATE TABLE"+DICTIONARY_DATABASE+" (" +
    ITEM_ID_COLUMN + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
    WORD_COLUMN+" TEXT , "+
    DEFINTION_COLUMN+" TEXT)";

    final static String ON_UPGRADE_QUERY = "DROP TABLE" +DICTIONARY_DATABASE;

    Context context;
    public DictionaryDatabaseHelper(Cont ext context, String name, 
		CursorFactory factory, int version) {
		super(context, DICTIONARY_DATABASE, factory, version);
		this.context = context;
	}
	@Override
    public void onCreate(SQLiteDatabase arg0) {
    	database.execSQL(CREATE_DATABASE_QUERY);
    }
@Override
public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        database.execSQL(ON_UPDATE_QUERY);
        onCreate(database);
}
public void insertData(WordDefintion wordDefinition) {
    SQLiteDatabase database = this.getWritableDatabase();
    ContentValues values = new ContentValues();

    values.put(WORD_COLUMN, wordDefinition.word);
    values.put(DEFINITION_COLUMN, wordDefinition.definition);

    database.insert(DICTIONARY_DATABASE, null, values);
}
public void updateData(WordDefintion wordDefinition) {
    SQLiteDatabase database = this.getWritableDatabase();
    ContentValues values = new ContentValues();

    values.put(WORD_COLUMN, wordDefinition.word);
    values.put(DEFINITION_COLUMN, wordDefinition.definition);

    database.update(DICTIONARY_DATABASE, values, whereCLause, whereArgs);
}
public class DictionaryLoader {
	public static void loadData() {

	}
}