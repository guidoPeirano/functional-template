(ns exercise2)

(defn greater-than-five
  [x]
  (> x 5)
  )
(defn only-greater-than-five
  "Creates a list with numbers only greater than five"
  [list]
  (filter greater-than-five list)
  )
