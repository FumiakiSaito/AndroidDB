# AndroidDB

##adb shellを使用しSQLITEを直接操作する

File -> Project StructureからSDK Locationを確認する
`/Users/fumiaki/Library/Android/`


コンソールでそこへ移動する  
`$ cd /Users/fumiaki/Library/Android/`

platform-toolsへ移動する  
`$ cd platform-tools`

adb shellを起動する    
`$ ./adb shell`

databaseへ移動  
`# cd data/data/[パッケージID(com.example.hoge.mydbapp)]/databases`

databaseへ接続  
`# sqlite3 [db名]`

```
.help              // ヘルプ確認
.tables            // テーブル一覧
.schema [テーブル名] // スキーマ確認
[SQLコマンド]       // SQLコマンド実行
.exit              // 抜ける
```