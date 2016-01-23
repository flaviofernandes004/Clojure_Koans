(ns clojure-koans.problem011)
;Problem #011
(defn problem
[answer]
(= {:a 1, :b 2, :c 3} (conj {:a 1} answer [:c 3])))

(problem {:b 2}) 
