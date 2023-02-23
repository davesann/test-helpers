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
## Usage

refer to tests for examples:

* clj   : [let-map tests](src/test/clj/dsann/test_test.clj)
* cljs  : [let-map tests](src/test/clj/dsann/test_cljs_test.cljs)
* cljc  : [let-map tests](src/test/clj/dsann/test_cljc_test.cljc)

in clj:
```
(:require
  [clojure.test :refer [deftest testing]]
  [dsann.test   :refer [is are throws]])
```

in cljs:
```
(:require
  [cljs.test  :refer [deftest testing]])
  [dsann.test :refer [is are throws]])
```

in cljc:
```
(:require
  #?(:clj  [clojure.test :refer [deftest testing]]
     :cljs [cljs.test    :refer [deftest testing]])
  [dsann.test :refer [is are throws]])
```

## Deps

```clojure
<%= git-coord-name %> {:git/tag "<%= latest-git-tag %>" :git/sha "<%= latest-git-sha %>"}
```

