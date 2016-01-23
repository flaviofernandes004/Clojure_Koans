(ns clojure-koans.problem035)
  ;Problem #
  (defn problem
    [answer]
    (and 
      (= answer (let [x 5] (+ 2 x)))
      (= answer (let [x 3, y 10] (- y x)))
      (= answer (let [x 21] (let [y 3] (/ x y))))))

(problem 7)
