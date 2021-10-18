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
  (throws java.lang.Exception (some code)))
```

## Deps

```clojure
  io.github.davesann/test-helpers {:git/sha "7d61d7c" :git/tag "v1"}
```

## Git Tags

* v1:
    * 7d61d7cf4b8d738cda3b330c29b62574e05addb8
    * 7d61d7c # test-helpers

