(ns dsann.test
  #?(:clj
     (:require
       [net.cgrand.macrovich :as macros]
       [clojure.template     :refer [do-template]]
       [dsann.macros.helpers :refer [assert-args]]))
  #?(:cljs 
     (:require-macros 
       [net.cgrand.macrovich :as macros]
       [dsann.test :refer [are is throws]]))) 

(macros/deftime
  (defmacro are 
    "modifies are so that you can just provide a predicate to compare 2 values
    e.g. (are =
              1 1
              2 2)
    "
    [f & body]
    (assert-args (even? (count body)) "an even number of forms")
    (macros/case
      :clj  
      `(clojure.test/are [x y] (~f x y) ~@body)
      :cljs
      `(cljs.test/are [x y] (~f x y) ~@body)))

  (defmacro is 
    "modifies is so that you can just provide a predicate to compare 2 values
    e.g. (is = 1 1)
  "
    [f arg1 arg2]
    (macros/case
     :clj  
     `(clojure.test/is (~f ~arg1 ~arg2))
     :cljs
     `(cljs.test/is    (~f ~arg1 ~arg2))))

  (defmacro throws 
    "adds throws case
    e.g (throws 
            ExceptionInfo (f)
            Exception     (g))
  " 
    [& args]
    (assert-args (even? (count args)) "an even number of forms")
    (let [thrown-sym 'thrown?]
       (do-template
         [ex form]
         (macros/case 
           :clj  `(clojure.test/is (~thrown-sym ex form))
           :cljs `(cljs.test/is    (~thrown-sym ex form)))
         ~@args))))
