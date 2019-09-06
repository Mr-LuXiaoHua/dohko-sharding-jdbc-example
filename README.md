dohko-sharding-jdbc-example
---
sharding-jdbc分库分表example

## dohko-sharding-table
演示不分库只分表，根据user_id % 2 分成两张表：t_user_0 和 t_user_1

![sharding table](https://github.com/Mr-LuXiaoHua/dohko-sharding-jdbc-example/blob/master/dohko-sharding-table/src/main/resources/static/sharding-table.png)


## dohko-sharding-db
演示只分库不分表，根据user_id % 2 分成两个库：ds0 和 ds1

![sharding table](https://github.com/Mr-LuXiaoHua/dohko-sharding-jdbc-example/blob/master/dohko-sharding-db/src/main/resources/static/sharding-ds.png)


## dohko-sharding-db-table
演示分库分表，先根据gender % 2 分库：ds0 和 ds1，再根据user_id % 2 分表：t_user_0 和 t_user_1

![sharding table](https://github.com/Mr-LuXiaoHua/dohko-sharding-jdbc-example/blob/master/dohko-sharding-db-table/src/main/resources/static/sharding-db-table.png)
