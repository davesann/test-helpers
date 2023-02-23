(ns dsann.test-test
  (:require
    [clojure.test :as t :refer [deftest testing]]
    [dsann.test   :as dt]))

(defn pred? [x y] (> x y))

(deftest testing-tests
  (testing "dsann.test.is"
    (dt/is = 1 1))

  (testing "dsann.test.are"
    (dt/are =
            1 1
            2 2)
    (dt/are > 
           2 1
           3 2)
    (dt/are pred? 
          2 1
          3 2))

  (testing "dsann.test.are"
    (dt/throws
      clojure.lang.ExceptionInfo (throw (ex-info "dummy" {}))
      java.lang.Exception        (throw (java.lang.Exception.)))))
