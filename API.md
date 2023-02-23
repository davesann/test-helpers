# Table of contents
-  [`dsann.test`](#dsann.test) 
    -  [`are`](#dsann.test/are) - modifies are so that you can just provide a predicate to compare 2 values e.g.
    -  [`is`](#dsann.test/is) - modifies is so that you can just provide a predicate to compare 2 values e.g.
    -  [`throws`](#dsann.test/throws) - adds throws case e.g (throws ExceptionInfo (f) Exception (g)).

-----
# <a name="dsann.test">dsann.test</a>






## <a name="dsann.test/are">`are`</a> [:page_facing_up:](https://github.com/davesann/let-map/blob/main/src/main/clj/dsann/test.cljc#L13-L25)
<a name="dsann.test/are"></a>
``` clojure

(are f & body)
```


Macro.


modifies are so that you can just provide a predicate to compare 2 values
    e.g. (are =
              1 1
              2 2)
    

## <a name="dsann.test/is">`is`</a> [:page_facing_up:](https://github.com/davesann/let-map/blob/main/src/main/clj/dsann/test.cljc#L27-L36)
<a name="dsann.test/is"></a>
``` clojure

(is f arg1 arg2)
```


Macro.


modifies is so that you can just provide a predicate to compare 2 values
    e.g. (is = 1 1)
  

## <a name="dsann.test/throws">`throws`</a> [:page_facing_up:](https://github.com/davesann/let-map/blob/main/src/main/clj/dsann/test.cljc#L38-L52)
<a name="dsann.test/throws"></a>
``` clojure

(throws & args)
```


Macro.


adds throws case
    e.g (throws 
            ExceptionInfo (f)
            Exception     (g))
  
