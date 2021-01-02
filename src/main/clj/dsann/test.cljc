(ns dsann.test
  (:require
    [dsann.macros.helpers :refer [assert-args]]
    [net.cgrand.macrovich :as macros]
    [clojure.test         :as t])
  ; cljs must self refer macros
  #?(:cljs (:require-macros
             [dsann.test :refer [are]])))


(defmacro are [f & body]
  (assert-args (even? (count body)) "an even number of forms")
  `(t/are [x y] (~f x y)
      ~@body))

(defmacro is [f arg1 arg2]
  `(t/is (~f ~arg1 ~arg2)))

(defmacro throws [c form]
  (let [thrown-sym 'thrown?]
    `(t/is (~thrown-sym ~c ~form))))

