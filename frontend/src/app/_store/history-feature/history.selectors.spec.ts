import {HistoryState} from "./history.model";
import {historyStateMock} from "./history.mocks";
import {selectHistory, selectHistoryByValue} from "./history.selector";

describe("Selectors", () =>{
  const initState: HistoryState = historyStateMock


it("should select history", () =>{
  const result = selectHistory.projector(initState);
  expect(result.length).toEqual(2);
  expect(result[1].value).toEqual(5);
})
  it("should return 1 get by value", () =>{
    const result = selectHistoryByValue(5).projector(initState)
    expect(result).not.toEqual(null)
    expect(result).toEqual(1)
  })

});


