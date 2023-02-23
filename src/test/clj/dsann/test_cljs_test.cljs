(ns dsann.test-cljs-test
  (:require
    [cljs.test :as t :refer [deftest testing]]
    [dsann.cljs-test :refer [is are throws]]))


(defn pred? [x y] (> x y))


(deftest testing-tests
  (testing "dsann.test.is"
    (is = 1 1))

  (testing "dsann.test.are"
    (are =
            1 1
            2 2)
    (are > 
           2 1
           3 2)
    (are pred? 
          2 1
          3 2))

  (testing "dsann.test.are"
    (throws
      ExceptionInfo (throw (ex-info "dummy" {}))
      js/Error      (throw (js/Error.)))))
