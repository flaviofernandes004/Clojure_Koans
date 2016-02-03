(ns clojure-koans.problem045)
  ;Problem #
  (defn problem
    [answer]
    (= answer (take 5 (iterate #(+ 3 %) 1))))

(problem [1 4 7 10 13])
