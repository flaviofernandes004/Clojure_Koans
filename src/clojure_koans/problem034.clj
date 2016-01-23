(ns clojure-koans.problem034)
  ;Problem #
  (defn problem
    [answer]
    (and 
      (= (answer 1 4) '(1 2 3))
      (= (answer -2 2) '(-2 -1 0 1))
      (= (answer 5 8) '(5 6 7))))

(problem (fn foo 
           [init end] 
           (when (< init end) 
             (conj (foo (inc init) end) init))))
