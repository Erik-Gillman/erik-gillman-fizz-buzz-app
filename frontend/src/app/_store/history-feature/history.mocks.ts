import {HistoryState} from "./history.model";

export const historyMock: {value: number; textResponse: string, id: number}[] = [
  {
    value: 3,
    textResponse: 'Fizz',
    id: 0
  },
  {
    value: 5,
    textResponse: 'Buzz',
    id: 1
  }
];
export const historyMock2: {value: number; textResponse: string, id: number}[] = [
  {
    value: 3,
    textResponse: 'Fizz',
    id: 0
  }
];
export const historyStateMock: HistoryState = {
  history: historyMock
}

export const historyStateMock2: HistoryState = {
  history: historyMock2
}
