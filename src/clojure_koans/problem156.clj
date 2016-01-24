(ns clojure-koans.problem156)
;Problem #
(defn problem
  [answer]
  (and
    (= (answer 0 [:a :b :c]) {:a 0 :b 0 :c 0})
    (= (answer "x" [1 2 3]) {1 "x" 2 "x" 3 "x"})
    (= (answer [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})))

 (problem (fn
            [newValue coll]
            (into {}
              (for [k  coll] [k newValue]))))
