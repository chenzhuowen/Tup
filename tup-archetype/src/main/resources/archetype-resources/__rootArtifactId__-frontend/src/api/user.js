import { get } from '@lib/httpRequest'

export const getUserInfo = (userName) => {
    return get('/api/getSysUserInfo', { userName: userName })
}
