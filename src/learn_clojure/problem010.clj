(ns learn-clojure.problem010)
;Problem #010
(defn problem
[answer]
(= answer ((hash-map :a 10, :b 20, :c 30) :b))
(= answer (:b {:a 10, :b 20, :c 30})))


(problem 20) 
