(ns clojure-koans.problem019)
  ;Problem #
  (defn problem
    [answer]
    (and 
      (= (answer [1 2 3 4 5]) 5)
      (= (answer '(5 4 3)) 3)
      (= (answer ["b" "c" "d"]) "d")))

(problem (fn
            [[x & xs]]
             (if (empty? xs)
               x
               (recur (rest xs)))))
