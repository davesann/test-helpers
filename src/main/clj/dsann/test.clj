(ns dsann.test
  (:require
    [clojure.test :as t]
    [clojure.template  :refer [do-template]]
    [dsann.macros.helpers :refer [assert-args]]))

(defmacro are 
  "modifies are so that you can just provide a predicate to compare 2 values
    e.g. (are =
              1 1
              2 2)
  "
  [f & body]
  (assert-args (even? (count body)) "an even number of forms")
  `(t/are [x y] (~f x y)
      ~@body))

(defmacro is 
  "modifies is so that you can just provide a predicate to compare 2 values
    e.g. (is = 1 1)
  "
  [f arg1 arg2]
  `(t/is (~f ~arg1 ~arg2)))

(defmacro throws 
  "adds throws case
    e.g (throws 
            ExceptionInfo (f)
            Exception     (g))
  " 
  [& args]
  (assert-args (even? (count args)) "an even number of forms")
  (let [thrown-sym 'thrown?]
    `(do-template
       [ex form]
       (t/is (~thrown-sym ex form))
       ~@args)))

