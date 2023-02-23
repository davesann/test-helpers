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

from clj  
```clojure
(:require [dsann.test :refer [is are throws]])
```

from cljs
```clojure
(:require [dsann.cljs-test :refer [is are throws]])
```

from cljc 
```clojure
(:require #?(:clj  [dsann.test :refer [is are throws]]
             :cljs [dsann.cljs-test :refer [is are throws]]))
```

from clj generically with clojure.test
```clojure
  (:require
    #?@(:clj  [[clojure.test    :refer [deftest testing]]
               [dsann.test      :refer [is are throws]]]
        :cljs [[cljs.test       :refer [deftest testing]]
               [dsann.cljs-test :refer [is are throws]]]))
```

I wanted to have a generic include - but this seems hard (impossible?) when using a cljs lib in a macro expansion. 
So I had to split the namespaces.

## Deps

```clojure
<%= git-coord-name %> {:git/tag "<%= latest-git-tag %>" :git/sha "<%= latest-git-sha %>"}
```

