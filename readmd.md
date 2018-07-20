##个人博客后端项目##

过程中遇到的问题

1.使用jpa save信息一直报错：MySQLSyntaxErrorException,检查之后一直没发现问题,后来发现数据库字段：desc是mysql的关键字,导致save的时候报错。
