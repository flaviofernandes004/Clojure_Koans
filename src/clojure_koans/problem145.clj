(ns clojure-koans.problem145)
  ;Problem #
  (defn problem
    [answer]
    (and 
      (= answer (for [x (range 40)
            :when (= 1 (rem x 4))]
        x))
      (= answer (for [x (iterate #(+ 4 %) 0)
            :let [z (inc x)]
            :while (< z 40)]
        z))
      (= answer (for [[x y] (partition 2 (range 20))]
        (+ x y)))))

(problem '(1 5 9 13 17 21 25 29 33 37))
