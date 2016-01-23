(ns clojure-koans.problem036)
  ;Problem #
  (defn problem
    []
    (and
      (= 10 (let __ (+ x y)))
      (= 4 (let __ (+ y z)))
      (= 1 (let __ z))))

  ;Answer [x 7 y 3 z 1]

