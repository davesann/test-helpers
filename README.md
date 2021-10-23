# Simple test helper macros

Wrappers on clojure.test - because I prefer writing them this way.

```clojure
(require '[dsann.test :refer [are is throws])

(defn some-predicate? [x y]
    ...)

(deftest some-test
  (is = 1 1)
  (is some-predicate? a b)
  (are =
    1 1
    2 3
    ...)
  (throws
     java.lang.Exception (some code)))
     Some.Exception      (some other code))) ;; multiple args here since v2
```

## Deps

```clojure
  io.github.davesann/test-helpers {:git/sha "7d61d7c" :git/tag "v1"}
  io.github.davesann/test-helpers {:git/sha "0cfda65" :git/tag "v2"}
```

## Git Tags

* v1:
    * 7d61d7cf4b8d738cda3b330c29b62574e05addb8
    * 7d61d7c
* v2
    * 0cfda659ee4c829245995ce57b276b684a4c3dad
	* 0cfda65

