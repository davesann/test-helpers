(ns dsann.test-cljc2-test
  (:require
    #?@(:clj  [[clojure.test    :refer [deftest testing]]]
        :cljs [[cljs.test       :refer [deftest testing]]])
    [dsann.test2 :refer [is are throws]])
  #?(:clj (:import [clojure.lang ExceptionInfo])))  


(defn pred? [x y] (> x y))

(defn this-throws []
  #?(:clj  (throw (java.lang.Exception.))
     :cljs (throw (js/Error.))))

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
      #?(:clj java.lang.Exception :cljs js/Error) (this-throws))))



