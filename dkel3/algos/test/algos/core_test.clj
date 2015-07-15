(ns algos.core-test
  (:require [clojure.test :refer :all]
            [algos.core :refer :all]))

(deftest fact-test
  (testing "fact"
    (is (= (fact 3) 6))
    (is (= (fact 1) 1))
    (is (= (fact 5) 120))))

(deftest fibo-test
  (testing "fibo"
    (is (= (fibo 0) 0))
    (is (= (fibo 1) 1))
    (is (= (fibo 2) 1))
    (is (= (fibo 5) 5))
    (is (= (fibo 7) 13))))
