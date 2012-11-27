(ns proptdd.core-test
  (:use clojure.test
        proptdd.core)
  (:require [clojurecheck.core :as cc]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(deftest a-property-test
  (cc/property "FIXME, I fail too"
    [diff (cc/float :lower -180.0 :upper 180.0)
     a    (cc/float :lower 0.0 :upper 360.0)
     n    (cc/int)]
    (let [b (+ a (* 360 n) diff)]
      (is (> a  b)))))

