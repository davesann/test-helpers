(ns dsann.test
  (:require
    [clojure.test         :as    t]
    [clojure.template     :refer [do-template]]
    [net.cgrand.macrovich :as macros]
    [dsann.macros.helpers :refer [assert-args]])
  ; cljs must self refer macros
  #?(:cljs (:require-macros
             [dsann.test :refer [are]])))

(macros/deftime
  (defmacro are [f & body]
    (assert-args (even? (count body)) "an even number of forms")
    `(t/are [x y] (~f x y)
        ~@body))

  (defmacro is [f arg1 arg2]
    `(t/is (~f ~arg1 ~arg2)))

  (defmacro throws [& args]
    (assert-args (even? (count args)) "an even number of forms")
    (let [thrown-sym 'thrown?]
      `(do-template
         [ex form]
         (t/is (~thrown-sym ex form))
         ~@args))))

