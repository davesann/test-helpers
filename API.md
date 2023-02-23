# Table of contents
-  [`dsann.cljs-test`](#dsann.cljs-test) 
    -  [`are`](#dsann.cljs-test/are) - modifies are so that you can just provide a predicate to compare 2 values e.g.
    -  [`is`](#dsann.cljs-test/is) - modifies is so that you can just provide a predicate to compare 2 values e.g.
    -  [`throws`](#dsann.cljs-test/throws) - adds throws case e.g (throws ExceptionInfo (f) Exception (g)).
-  [`dsann.test`](#dsann.test) 
    -  [`are`](#dsann.test/are) - modifies are so that you can just provide a predicate to compare 2 values e.g.
    -  [`is`](#dsann.test/is) - modifies is so that you can just provide a predicate to compare 2 values e.g.
    -  [`throws`](#dsann.test/throws) - adds throws case e.g (throws ExceptionInfo (f) Exception (g)).
-  [`dsann.test-cljc-test`](#dsann.test-cljc-test) 
    -  [`pred?`](#dsann.test-cljc-test/pred?)
    -  [`testing-tests`](#dsann.test-cljc-test/testing-tests)
    -  [`this-throws`](#dsann.test-cljc-test/this-throws)
-  [`dsann.test-cljs-test`](#dsann.test-cljs-test) 
    -  [`pred?`](#dsann.test-cljs-test/pred?)
    -  [`testing-tests`](#dsann.test-cljs-test/testing-tests)
-  [`dsann.test-test`](#dsann.test-test) 
    -  [`pred?`](#dsann.test-test/pred?)
    -  [`testing-tests`](#dsann.test-test/testing-tests)

-----
# <a name="dsann.cljs-test">dsann.cljs-test</a>






## <a name="dsann.cljs-test/are">`are`</a> [:page_facing_up:](https://github.com/davesann/let-map/blob/main/src/main/clj/dsann/cljs_test.clj#L7-L19)
<a name="dsann.cljs-test/are"></a>
``` clojure

(are f & body)
```


Macro.


modifies are so that you can just provide a predicate to compare 2 values
    e.g. (are =
              1 1
              2 2)
         (are #(> %1 %2)
              2 1
              3 4)
  

## <a name="dsann.cljs-test/is">`is`</a> [:page_facing_up:](https://github.com/davesann/let-map/blob/main/src/main/clj/dsann/cljs_test.clj#L21-L27)
<a name="dsann.cljs-test/is"></a>
``` clojure

(is f arg1 arg2)
```


Macro.


modifies is so that you can just provide a predicate to compare 2 values
    e.g. (is = 1 1)
         (is #(> %1 %2) 2 1)
  

## <a name="dsann.cljs-test/throws">`throws`</a> [:page_facing_up:](https://github.com/davesann/let-map/blob/main/src/main/clj/dsann/cljs_test.clj#L29-L41)
<a name="dsann.cljs-test/throws"></a>
``` clojure

(throws & args)
```


Macro.


adds throws case
    e.g (throws 
            ExceptionInfo (f)
            Exception     (g))
  

-----
# <a name="dsann.test">dsann.test</a>






## <a name="dsann.test/are">`are`</a> [:page_facing_up:](https://github.com/davesann/let-map/blob/main/src/main/clj/dsann/test.clj#L7-L16)
<a name="dsann.test/are"></a>
``` clojure

(are f & body)
```


Macro.


modifies are so that you can just provide a predicate to compare 2 values
    e.g. (are =
              1 1
              2 2)
  

## <a name="dsann.test/is">`is`</a> [:page_facing_up:](https://github.com/davesann/let-map/blob/main/src/main/clj/dsann/test.clj#L18-L23)
<a name="dsann.test/is"></a>
``` clojure

(is f arg1 arg2)
```


Macro.


modifies is so that you can just provide a predicate to compare 2 values
    e.g. (is = 1 1)
  

## <a name="dsann.test/throws">`throws`</a> [:page_facing_up:](https://github.com/davesann/let-map/blob/main/src/main/clj/dsann/test.clj#L25-L37)
<a name="dsann.test/throws"></a>
``` clojure

(throws & args)
```


Macro.


adds throws case
    e.g (throws 
            ExceptionInfo (f)
            Exception     (g))
  

-----
# <a name="dsann.test-cljc-test">dsann.test-cljc-test</a>






## <a name="dsann.test-cljc-test/pred?">`pred?`</a> [:page_facing_up:](https://github.com/davesann/let-map/blob/main/src/test/clj/dsann/test_cljc_test.cljc#L10-L10)
<a name="dsann.test-cljc-test/pred?"></a>
``` clojure

(pred? x y)
```


## <a name="dsann.test-cljc-test/testing-tests">`testing-tests`</a> [:page_facing_up:](https://github.com/davesann/let-map/blob/main/src/test/clj/dsann/test_cljc_test.cljc#L16-L34)
<a name="dsann.test-cljc-test/testing-tests"></a>
``` clojure

(testing-tests)
```


## <a name="dsann.test-cljc-test/this-throws">`this-throws`</a> [:page_facing_up:](https://github.com/davesann/let-map/blob/main/src/test/clj/dsann/test_cljc_test.cljc#L12-L14)
<a name="dsann.test-cljc-test/this-throws"></a>
``` clojure

(this-throws)
```


-----
# <a name="dsann.test-cljs-test">dsann.test-cljs-test</a>






## <a name="dsann.test-cljs-test/pred?">`pred?`</a> [:page_facing_up:](https://github.com/davesann/let-map/blob/main/src/test/clj/dsann/test_cljs_test.cljs#L7-L7)
<a name="dsann.test-cljs-test/pred?"></a>
``` clojure

(pred? x y)
```


## <a name="dsann.test-cljs-test/testing-tests">`testing-tests`</a> [:page_facing_up:](https://github.com/davesann/let-map/blob/main/src/test/clj/dsann/test_cljs_test.cljs#L10-L28)
<a name="dsann.test-cljs-test/testing-tests"></a>
``` clojure

(testing-tests)
```


-----
# <a name="dsann.test-test">dsann.test-test</a>






## <a name="dsann.test-test/pred?">`pred?`</a> [:page_facing_up:](https://github.com/davesann/let-map/blob/main/src/test/clj/dsann/test_test.clj#L6-L6)
<a name="dsann.test-test/pred?"></a>
``` clojure

(pred? x y)
```


## <a name="dsann.test-test/testing-tests">`testing-tests`</a> [:page_facing_up:](https://github.com/davesann/let-map/blob/main/src/test/clj/dsann/test_test.clj#L8-L26)
<a name="dsann.test-test/testing-tests"></a>
``` clojure

(testing-tests)
```

