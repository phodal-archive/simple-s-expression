# Gating

- [ ] 嵌入型 DSL。诸如于 Call Chain
- [ ] 基于宿主语言的 DSL。借助于 Kotlin 构建 DSL？
- [ ] 独立于语言的 DSL。如 Antlr 等
- [ ] 完全独立的 DSL。

Kotlin Script as DSL

> a dsl override meta-data for architecture guarding

规则 DSL？

- match api:

通用规范：

- 命名。Naming
- 依赖。

types:

- system
- project
- uri (path,)
- package
- class
- function

naming:

- kebab-case
- camelCase
- PascalCase
- snake_case
- MACRO_CASE
- UPPERFLATCASE
- SCREAMING-KEBAB-CASE
- camel_Snake_Case
- Pascal_Snake_Case

sizing:

- length
- size

operator

- +
- -
- *
- /

condition express:

loop - 尽量不要在 loop 中 update 一个 var 值。

keywords：

- 使用 `Option`，替换 `null`。
- 不要使用 `Option.get`，尽量使用 `Option.getOrEles`，模式匹配。

physics:

* git change times
* relation change
*

其它：

尽量使用 val 和 immutable 的数据结构

## RuleEngine

pattern match

- patterName: query by xpath like ?
- matchTypes:
    - fuzzy
    - xpath?
    - grep

meta-patterns model

CrossServicesChecking

转换为：MySQL?

QueryDSL: [https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-range-query.html](https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-range-query.html)

## i18n

规则生成文档：

toChinese

should -> 应该
may -> 可以
not -> 不能

class_name.length should <= 20
class_name.naming should use kebab-case style with samples.

=>

类名的长度应该 <= 20
类名的命名应该使用 kebab-case style.

## module

service.

resource (`/api/resource`)

module.

class.one.inbound <=> class.one.inbound

table

- 循环依赖
- S 表达式
- Table Name

## PlayGround


## PatternMatch

by TreeSitter ?

RuleResult = { } 
