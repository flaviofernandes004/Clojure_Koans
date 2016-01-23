(ns clojure-koans.problem018)
  ;Problem #
  (defn problem
    [answer]
    (= answer (filter #(> % 5) '(3 4 5 6 7))))

(problem '(6 7))
