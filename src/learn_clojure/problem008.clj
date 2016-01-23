(ns learn-clojure.problem008)
;Problem #008
(defn problem
[answer]
(and 
  (= answer (set '(:a :a :b :c :c :c :c :d :d)))
  (= answer (clojure.set/union #{:a :b :c} #{:b :c :d}))))

(problem #{:a :b :c :d}) 
