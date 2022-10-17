### design_mode homework02 	实验报告

#### Iterator
```mermaid
classDiagram
class Aggregate{
<<interface>>
iterator()
}
class Iterator{
<<interface>>
hasNext()
next()
}
class PageAggregate{
-Pages[]
-CurPageAggregateSize
+addPage()
+iterator()
+getCurPageAggregateSize()
+getPageAt()
}
class PageAggregateIterator{
-pageAggregate
-page
+hasNext()
+next()
}
class Page{
-content
+getPagecontent
}
Iterator<|..PageAggregateIterator
Aggregate<|..PageAggregate
Iterator <-- Aggregate:Create
PageAggregateIterator o-- PageAggregate
PageAggregate o-- Page
```

#### class adapter

```mermaid
classDiagram
EncryptAdapter --|> EncryptAlgorithm
EncryptAdapter ..|> Encrypt
DBUtil ..> Encrypt :Uses

class DBUtil{
-String: userMail
-String: password
}

class EncryptAlgorithm{
+encryptAlgorhim1()
+encryptAlgorhim1()
}

class Encrypt{
<<interface>>
+encrypt(String) String
}

class EncryptAdapter{
+encryptStrong()
+encryptWeak()
}
```



#### object adapter

```mermaid
classDiagram
EncryptAdapter o-- EncryptAlgorithm
EncryptAdapter ..|> Encrypt
DBUtil ..> Encrypt :Uses

class DBUtil{
-String: userMail
-String: password
}

class EncryptAlgorithm{
+encryptAlgorhim1()
+encryptAlgorhim1()
}

class Encrypt{
<<abstract>>
+encryptStrong() String
+encryptWeak() String
}

class EncryptAdapter{
-EncryptAlgorithm encryptAlgorithm
}
```

#### template

```mermaid
classDiagram
DataProcess <|--  classifyAdapter
classifyAdapter o-- classifyAlgorithm

class DataProcess{
<<abstract>>
-data
-dataRaw
-result

-readData()
-convertDate()
+classifyData()
-printResult()
-processData()
}

class classifyAdapter{
+classifyData()
}

class classifyAlgorithm{
+NaiveBayesclassifyData()
+DecisionTreeclassifyData()
+KNNclassifyData()
}

```



#### factory

```mermaid
classDiagram
Product <.. Factory :Creates
Product <|-- Connection
Factory <|-- ConnectionFactory
Connection <.. ConnectionFactory :Creates

class Factory{
<<abstract>>
+create(owner) Product
#createProduct(owner) Product
#registerProduct(product)
}

class Product{
+use()
}

class Connection{
-protocol

+getProtocol() String
}

class ConnectionFactory{
pass
}
```

#### Singleton

饿汉单例式

```mermaid
classDiagram

class VirtualUserGenerator{
-virtualUserGenerator
-VirtualUserGenerator()
+getINstance() VirtualUserGenerator
}
```

双重检测锁

```mermaid
classDiagram

class VirtualUserGenerator{
-VirtualUserGenerator
-VirtualUserGenerator()
+getINstance() VirtualUserGenerator
}
```



loDH

```mermaid
classDiagram

class VirtualUserGenerator{

-VirtualUserGenerator()
+getINstance() VirtualUserGenerator
}
```

### prototype

```mermaid
classDiagram

Resume..|> Product
Product ..|> Cloneable

class Resume{
-name
-age
-photo

+createDeepClone
+createClone
}

class Product{
<<interface>>
}
```

### 实验小结

通过对上课所讲模式的code，对不同模式有了更深的理解，原型模式可以通过复制已有对象来创建对象来减小成本，遇到的问题是对模式不太熟悉，导致在实际编程时，对类与接口的实际实现上手比较困难，解决方法，观看上课课件，上网查资料解决

